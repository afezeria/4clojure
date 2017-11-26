(= (__ 99 9) [8 9 1])

(fn [x y]
  (vec (map #(Integer/parseInt (str %)) (str (* x y)))))
