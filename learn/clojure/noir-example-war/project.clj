(defproject my-weisite "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir "1.2.2"]]
            :dev-dependencies [[lein-ring "0.5.4"]]
            :ring {:handler my-weisite.server/handler}
            :main my-weisite.server)

