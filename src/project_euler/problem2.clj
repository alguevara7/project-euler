(ns project-euler.problem2)

;;learning to use recur...
(defn- fibonacci [n left-term right-term]
  (cond (= n 0) left-term
        (= n 1) right-term
        :else (recur (- n 1) right-term (+ left-term right-term))))

(defn fib [n]
  (fibonacci n 1 2))

; i need to improve the efficiency of this method
(defn fib-range []
  (map (fn [n] (fib n)) (range)))

(defn solution []
  (apply + (filter (fn [fib-number] (even? fib-number))
                   (take-while (fn [fib-number] (<= fib-number 4000000))
                               (fib-range)))))