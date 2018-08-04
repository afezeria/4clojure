(= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]])
#(map-indexed #(vector %2 %) c)
#(partition 2 (interleave % (take (count %) (range)))