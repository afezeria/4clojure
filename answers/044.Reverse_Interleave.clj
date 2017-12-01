(= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))

(= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

(= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

(fn [coll n]
   (sort-by first (partition (/ (count coll) n) (sort-by #(mod % n) coll))))

#(apply map vector (partition %2 %))