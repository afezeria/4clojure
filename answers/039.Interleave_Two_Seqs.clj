(fn [x y]
  (loop [c1 x 
         c2 y 
         result []]
    (if-not (and (empty? c1) (empty? c2))
      result
      (recur (rest c1) (rest c2) (assoc result (first c1) (first c2))))))
