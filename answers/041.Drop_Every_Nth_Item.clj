(= (_ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
#(mapcat (partial take (dec %2)) (partition-all %2 %1))
