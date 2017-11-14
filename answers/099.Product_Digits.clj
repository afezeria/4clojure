(= (__ 99 9) [8 9 1])

(fn [x y]
  (vec map #(Integer/parseInt (str %)) (vec (str (* x y)))))
