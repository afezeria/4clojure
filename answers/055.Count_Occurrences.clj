(= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

(= (__ [:b :a :b :a :b]) {:a 2, :b 3})

(fn [coll]
  (loop [m {} c coll]
    (if (nil? (seq c))
      m
      (recur (merge-with + m {(first c) 1}) (rest c)))))

#(into {}
  (map (fn [[k v]] [k (count v)]) (group-by identity %)))