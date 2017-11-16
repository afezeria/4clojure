(= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
#(set (concat (filter (complement %) %2) (filter (complement %2) %)))