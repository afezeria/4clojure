(= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])

;别人的答案
(fn it [f x]
  (lazy-seq (cons x (it f (f x)))))

;本来想用循环做的,想了很久发现循环不能生成无限序列