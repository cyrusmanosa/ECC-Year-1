import requests
from bs4 import BeautifulSoup
import datetime
import csv
import os
import time
import pandas as pd # 表データのモジュール
import matplotlib.pylab as plt # グラフのモジュール



def fx_scrayping():
    user_agent = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.1 Safari/605.1.15'
    header = {'User-Agent': user_agent}
    #サイトからデータを取得
    url = "https://finance.yahoo.co.jp/quote/USDJPY=FX"
    r = requests.get(url,headers=header)
    #現在時刻を取得
    now = datetime.datetime.now()
    now_19 = "{0.year}/{0.month}/{0.day}/{0.hour}:{0.minute}".format(now)
    #サイトから取得したデータから必要な部分を抽出
    soup = BeautifulSoup(r.text, 'html.parser');
    yen_price = soup.find('span', class_='_3Pvw_N8d').text
    print(now_19 + ' ドル円レート')
    print(yen_price + '円')
    return [now_19,yen_price]
    
fx_scrayping()