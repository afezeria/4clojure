(= (__ 2 4) 2)
(fn [x y]
  (if (= (mod x y) 0)
    y
    (recur y (mod x y))))
