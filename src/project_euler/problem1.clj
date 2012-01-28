(ns project-euler.problem1)

(defn solution []
  (apply + (filter #(or (zero? (rem % 3)) (zero? (rem % 5))) (range 1 1000))))