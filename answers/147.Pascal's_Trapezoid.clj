(= (take 5 (__ [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])

(= (second (__ [2 3 2])) [2 5 5 2])

(fn [v]
  (iterate #(vec (map + (cons 0 %) (conj % 0))) v))