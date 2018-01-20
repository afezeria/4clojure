(= [[1 1] [2 1] [1 2 1 1]] (take 3 (__ [1])))


#(drop 1 (iterate 
           (fn [coll] 
                (let [c (partition-by identity coll)]
                    (interleave (map count c) (map first c)))) 
            %))
