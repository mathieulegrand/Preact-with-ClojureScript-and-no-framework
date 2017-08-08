(defproject test     "0.0.1-SNAPSHOT"
  :license           {:name "Apache"}
  :min-lein-version  "2.7.1"

  :dependencies [[org.clojure/clojure       "1.8.0"   ]
                 [org.clojure/clojurescript "1.9.854" :scope "provided"]
                 [cljsjs/preact             "7.1.0-0" ]]

  :plugins      [[lein-cljsbuild            "1.1.7"]
                 [lein-figwheel             "0.5.12"]]

  :clean-targets ^{:protect false} ["resources/public/js"]

  :profiles {:dev  {:cljsbuild
                    {:builds {:client {:figwheel  {:websocket-url "ws://localhost:3450/figwheel-ws"
                                                   :on-jsload     "test.core/main"}
                                       :compiler  {:main          "test.core"
                                                   :asset-path    "/js/out"
                                                   :optimizations :none
                                                   :source-map    true
                                                   :source-map-timestamp true}}}}}
             :prod {:cljsbuild
                    {:builds {:client {:compiler  {:optimizations :advanced
                                                   :elide_assers  true
                                                   :pretty_print  false}}}}}}

  :cljsbuild {:builds {:client {:source-paths ["src"]
                                :compiler     {:output-to   "resources/public/js/test.js"
                                               :output-dir  "resources/public/js/out"}}}}

  :figwheel {:server-port  3450
             :http-server-root "public"})
