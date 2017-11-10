(= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
(fn [x y]
  (loop [c1 x
         c2 y
         result []]
    (if-not (and c1 c2)
      result
      (recur (next c1) (next c2) (conj result (first c1) (first c2))))))
