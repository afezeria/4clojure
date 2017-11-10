(defn test [& more]
  (let [coll (sort (apply interleave more))
        x (count more)]
         (ffirst (filter (fn [x] (every? #(= (first x) %) x)) (partition x 1 coll)))))


(defn test [& more]
  (let [coll (sort (apply flatten (vector more)))
        x (count more)]
         (ffirst (filter (fn [x] (every? #(= (first x) %) x)) (partition x 1 coll)))))
