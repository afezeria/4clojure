(= (__ ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}})

(fn [coll]
  (loop [m {} c coll]
    (if (nil? (seq c))
      (set (filter #(> (count %) 1) (vals m)))
      (recur (merge-with into m {(set (first c)) #{(first c)}}) (rest c)))))