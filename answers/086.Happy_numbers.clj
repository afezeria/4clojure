(= (__ 7) true)

(= (__ 986543210) true)

(fn [x]
  (letfn [(f [n] (reduce #(+ % (* %2 %2)) 0 (map #(Integer/valueOf (str %)) (seq (str n)))))]
    (loop [v x s #{}]
      (if (= v 1)
        true
        (if (contains? s v)
          false
          (recur (f v) (conj s v)))))))