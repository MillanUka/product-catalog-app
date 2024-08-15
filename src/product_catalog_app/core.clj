(ns product-catalog-app.core
  (:require [ring.adapter.jetty :as jetty]
            [product-catalog-app.stripe :as stripe]))

(defn handler [request]
  (stripe/create-stripe-session "" "" 1))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (jetty/run-jetty handler {:port 3000}))
