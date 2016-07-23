(ns clojure-katas.core-test
  (:require [clojure.test :refer :all]
            [clojure-katas.core :refer :all]))

(deftest should-return-one-for-number-1 
  (is (= (fizzBuzz 1) 1))
)
