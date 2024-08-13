(ns product-catalog-app.stripe
  (:require [clj-http.client :as client]
            [product-catalog-app.common :as common])
)


(defn create-stripe-session
(client/post (str stripe-base-url "v1/checkout/sessions") {:basic-auth "sk_token"
                                                           :body})
