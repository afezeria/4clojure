(= (__ [1 2 3] 2) '(1 1 2 2 3 3))
(fn [coll x] (mapcat #(repeat x%) coll))