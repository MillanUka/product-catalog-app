(ns product-catalog-app.db 
(:require [clojure.java.jdbc :refer :all]))

(def db
  {:classname   "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname     "db/product.db"
   })

(defn execute-query
  ""
  []
  (query db ["select * from product"]))


(defn print-result
  "prints the result set in tabular form"
  [result]
  (doseq [row result]
    (println row)))
