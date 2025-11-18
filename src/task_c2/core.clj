(ns task-c2.core
  (:require [clojure.test :refer [is]]))

(defn sieve
  "Generates an infinite sequence of prime numbers using the Sieve of Eratosthenes."
  [numbers]
  (let [p (first numbers)]
    (cons p
          (lazy-seq
            (sieve
              (filter
                (fn [n] (not= (mod n p) 0))
                (rest numbers)))))))

(defn primes
  "Returns an infinite sequence of prime numbers."
  []
  (sieve (iterate inc 2)))