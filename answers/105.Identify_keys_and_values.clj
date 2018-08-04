(= {:a [1 2 3],:b [],:c [4]} (__ [:a 1 2 3 :b :c 4]))
#(loop [result {}
          myvector %]
     (if (empty? myvector)
       result
       (recur (assoc result (first  myvector) (if (keyword? (first (rest  myvector))) () (take-while (complement keyword?) (rest myvector)))) (drop-while (complement keyword?) (rest myvector)))))

;别人的答案
(fn [coll]
  (cond
    (empty? coll) {}
    :else (apply assoc {} 
         	(mapcat #(if (keyword? (first %))
                       (drop-last (interleave % (repeat ())))
                       [%])
                    (partition-by keyword? coll)))))

(fn conv [s]
  (reduce (fn [r [k v]]
            (assoc (into r (zipmap k (repeat []))) (last k) v)) {}
          (partition 2 (partition-by keyword? s))))
