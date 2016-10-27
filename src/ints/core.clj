(ns ints.core
  (:require
   [clojure.data.codec.base64 :as b64]
   ;;   [clojure.spec :as s]
   )
  (:import
   [clojure.lang BigInt]
   [java.math BigInteger]))


;; (s/def ::valid-big-int inst? (BigInt.))
;; (s/def ::valid-byte-array )
;; (s/fdef bigint->b64
;;         :args
;;         :ret
;;         )

;; (s/fdef b64->bigint
;;         :args
;;         :ret
;;         )

(defn bigint->b64
  [i]
  (-> i
      .toBigInteger
      .toByteArray
      b64/encode))


(defn b64->bigint
  [b]
  (-> b
      b64/decode
      BigInteger.
      BigInt/fromBigInteger))
