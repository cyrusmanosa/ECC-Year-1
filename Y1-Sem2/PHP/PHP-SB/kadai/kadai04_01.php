<?php
    class Kadai04{
        public $price = 0;
        const TAX_RATE = 0.1;
        // public $rate = 10;

        public function __construct($price){
            $this -> price = $price;
        }

        public function calc(){
            return $this -> price + ($this->price * self::TAX_RATE);
        }

        public function getprice(){
            return $this -> price;
        }

        public function getrate(){
            return self:: TAX_RATE * 100;
        }
    }
?>