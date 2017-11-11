(= (__ 0 [1 2 3]) [1 0 2 0 3])
#(-> (interleave %2 (repeat %1)) drop-last vec)