(= (__ '(1 2 3 3 1)) 5)

(fn [coll]
  (loop [x 0 coll coll]
    (if (empty? coll)
      x
      (recur (inc x) (rest coll)))))