(true? (#(nil? (%2 %1 0)) :a {:a nil :b 2}))

(false? ((fn [x y] (if (contains? y x) (nil? (x y)) false)) :b {:a nil :b 2}))

(false? (#(and (contains? %2 %1) (nil? (%1 %2))) :c {:a nil :b 2}))