(ns ints.core-test
  (:require [clojure.test :refer :all]
            [ints.core :as core]))

(deftest test-roundtrip
  (let [a (bigint 12)
        cin (core/bigint->b64 a)
        cout (core/b64->bigint cin)] ;; should be random!
    (is (= a (core/b64->bigint (core/bigint->b64 a))))))
