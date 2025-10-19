(ns task-c1.core)

(defn no-adjacent-repeats
  "Returns all strings of length N from alphabet with no equal subsequent characters."
  [alphabet n]
  (if (= n 1)
    alphabet
    (reduce
      (fn [strings _]
        (apply concat
               (map
                 (fn [s]
                   (filter
                     (fn [new-s]
                       (not= (last s) (last new-s)))
                     (map
                       (fn [c] (str s c))
                       alphabet)))
                 strings)))
      alphabet
      (range (dec n)))))

(defn -main
  []
  (println no-adjacent-repeats ["a" "b" "c"] 3)
  (no-adjacent-repeats ["a" "b" "c"] 1)
  (no-adjacent-repeats ["a" "b" "c"] 2)
  )