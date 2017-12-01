(= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})

(= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})

(fn [coll]
  (loop [m {} c coll]
    (if (nil? (seq c))
      (vals m)
      (recur (merge-with concat m {(class (first c)) (vector (first c))}) (rest c)))))

;忘了有个group-by
#(vals (group-by class %))