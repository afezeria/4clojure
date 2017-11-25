(= [3 4 5 6 7]
   (__ inc [2 3 4 5 6]))

;通不过最后一个count无法处理无限序列
(fn mytest [f coll]
  (if (= 1 (count coll))
    (vector (f (first coll)))
    (lazy-seq(cons (f (first coll)) (mytest f (rest coll))))))

;count无法处理惰性序列，修改一下
(fn mytest [f coll]
  (if (false? (empty? coll))
        (lazy-seq
          (cons (f (first coll)) (mytest f (rest coll))))))

；别人的答案
(fn mp [f s]
  (lazy-seq
    (when (seq s)
      (cons (f (first s)) (mp f (rest s))))))