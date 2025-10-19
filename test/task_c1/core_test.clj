(ns task-c1.core-test
  (:require [clojure.test :refer :all]
            [task-c1.core :refer :all]))

(deftest no-adjacent-repeats-test
  (is (= (set (no-adjacent-repeats ["a" "b" "c"] 2))
         #{"ab" "ac" "ba" "bc" "ca" "cb"})))
