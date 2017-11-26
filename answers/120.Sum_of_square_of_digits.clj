(= 8 (__ (range 10)))

(fn [coll]
    (count (filter (fn [x] (< x (reduce + (map #(* % %) (map #(Integer/parseInt (str %)) (str x)))))) coll)))
