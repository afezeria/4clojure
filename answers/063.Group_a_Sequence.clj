(= (__ #(> % 5) [1 3 6 8]) {false [1 3],true [6 8]})
(fn [f coll]
  (into {}
        (map #(vector (f (first %)) (vec %))
             (partition-by f (sort-by fy coll)))))