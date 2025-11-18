(ns task-c2.core-test
  (:require [clojure.test :refer :all]
            [task-c2.core :refer :all]))

(deftest primes-test
  (testing "First few prime numbers"
    (is (= [2 3 5 7 11 13]
           (take 6 (primes))))
    (is (= [2 3 5 7 11 13 17 19 23 29]
           (take 10 (primes))))
    (is (= [2]
           (take 1 (primes))))
    (is (= []
           (take 0 (primes))))))
