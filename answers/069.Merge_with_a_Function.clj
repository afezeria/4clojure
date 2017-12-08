(= (__ * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
 {:a 4, :b 6, :c 20})

(= (__ - {1 10, 2 20} {1 3, 2 10, 3 15})
 {1 7, 2 10, 3 15})

(fn [f m & args]
  (loop[m m coll (seq (apply merge args))]
      (if (nil? (seq coll))
       m
       (recur (merge m {(first (first coll))
               (if (contains? m (first (first coll))) 
                (f (m (first (first coll))) (second (first coll)))
                (second (first coll)))})
        (rest coll)))))

(fn [f & args]
  (reduce #(reduce (fn [m [k v]] 
                      (let [v1 (m k)] 
                        (assoc m k (if v1 (f v1 v) v)))) % %2) 
          args))
