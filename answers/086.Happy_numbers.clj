(= (__ 7) true)

(= (__ 986543210) true)

(fn [x]
  (letfn [(f [n] (reduce #(+ % (* %2 %2)) 0 (map #(Integer/valueOf (str %)) (seq (str n)))))]
    (loop [result x s #{}]
      (if (= result 1)
        true
        (if (contains? s result)
          false
          (recur (f result) (conj s result)))))))