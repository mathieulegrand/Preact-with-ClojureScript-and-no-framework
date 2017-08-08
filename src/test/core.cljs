(ns ^:figwheel-always test.core
  (:require [ cljsjs.preact ]
            [ goog.dom      ]
            [ goog.object   ]))

(defn Test [props state]
  (cljs.core/this-as this (js/preact.Component.call this props state) this))


(defn ^:export main []
  (println "Main started.")
  (goog.object/extend (.. Test -prototype) js/preact.Component.prototype
                      #js {:render (fn []
                                     (println "Rendering")
                                     (.h js/preact "div" #js {} "Hello World!"))})
  (js/preact.render (.h js/preact Test) (goog.dom/getElement "test-root")))

(enable-console-print!)
(main)
