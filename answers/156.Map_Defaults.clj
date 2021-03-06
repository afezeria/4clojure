(= (___ 0 [:a :b :c]) {:a 0 :b 0 :c 0})
(fn [x y] 
  (loop [val (repeat (count y) x) key y newmap {}] 
    (if-not (> (count val) 0)
      newmap
      (recur (rest val) (rest key) (assoc newmap (first key) (first val))))))

(fn [x y]
  (let [val (repeat (count y) x) key y]
    (into {} (map #(assoc {} %1 %2) key val))))

;(if-not (> (count val) 0) ) 应该用 (if (empty? val))代替
;实际上这个匿名函数的功能zipmap已经实现了

#(zipmap %2 (repeat %1))
