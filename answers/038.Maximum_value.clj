(= (#(reduce (fn [x y] (if (> x y) x y)) %&) 1 8 3 4) 8)