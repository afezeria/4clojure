(= (take 5 (__ + (range))) [0 1 3 6 10])

(fn mytest
  ([f coll] (mytest f (first coll) (rest coll)))
  ([f v coll]
   (cons v
         (lazy-seq
           (if-let [s (seq coll)]
             (mytest f (f v (first s)) (rest s)))))))
