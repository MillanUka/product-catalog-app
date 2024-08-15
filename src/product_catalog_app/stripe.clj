(ns product-catalog-app.stripe
  (:require [clj-http.client :as client]
            [product-catalog-app.common :as common]))

(defn create-stripe-session [token price quantity]
  (client/post (str common/stripe-base-url "/v1/checkout/sessions") {:headers {"Content-Type" "application/x-www-form-urlencoded"}
                                                                     :basic-auth [token ""]
                                                                     :body (str "success_url=https://millanuka.com&line_items[0][price]=" price "&line_items[0][quantity]=" quantity "&mode=payment")}))

