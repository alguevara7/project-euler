(ns project-euler.problem3
  (:use [clojure.contrib.math]
        [clojure.contrib.lazy-seqs :as seqs]))

(defn solution [number]
  (apply max (filter (fn [prime] (zero? (rem number prime)))
                     (take-while (fn [prime] (< prime (sqrt number))) seqs/primes))))

(defn -main []
  (println (str "solution = " (solution 600851475143))))