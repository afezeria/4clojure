(= (__ '{a {p 1, q 2}
         b {m 3, n 4}})
   '{[a p] 1, [a q] 2
     [b m] 3, [b n] 4})

(= (__ '{[1] {a b c d}
         [2] {q r s t u v w x}})
   '{[[1] a] b, [[1] c] d,
     [[2] q] r, [[2] s] t,
     [[2] u] v, [[2] w] x})

;����о�û����ָ����mapǶ�ף����Ǹ������Ĳ��Զ�������ġ�����д�˸����ض�������
(fn [m]
  (into {} (flatten ((fn f [p m]
                       (for [[k v] m]
                         (if (map? v)
                           (vec (f (conj p k) v))
                           {(conj p k) v}))) [] m))))

;���˵Ĵ𰸣��ض�����Ƕ��
(fn [m]
  (into {}
        (for [[k r] m
              [l v] r]
          [[k l] v])))
