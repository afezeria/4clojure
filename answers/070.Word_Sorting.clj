(= (__  "Have a nice day.")
   ["a" "day" "Have" "nice"])

#(sort-by (fn [v](.toUpperCase v))  (re-seq #"\w+" %))
