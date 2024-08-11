(ns {{namespace}}.main-test
 (:require [clojure.test :refer [deftest is testing]]
           [{{namespace}}.main :as m]))

(deftest fail-me
  (testing "This test should fail"
    (is (= 2 3))))

(deftest pass-me
  (testing "This test should pass"
    (is (= 1 1))))
