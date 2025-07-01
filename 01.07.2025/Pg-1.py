import pandas as pd
import numpy as np
from datetime import datetime, timedelta
import matplotlib.pyplot as plt
from statsmodels.tsa.arima.model import ARIMA

data = {
    'date': pd.date_range(start='2023-01-01', periods=100, freq='D'),
    'sales': np.random.randint(20, 100, size=100)
}
df = pd.DataFrame(data)
df.set_index('date', inplace=True)

plt.figure(figsize=(10,5))
df['sales'].plot(title='Daily Sales')
plt.xlabel('Date')
plt.ylabel('Units Sold')
plt.grid(True)
plt.show()
model = ARIMA(df['sales'], order=(5,1,0))
model_fit = model.fit()
forecast = model_fit.forecast(steps=10)
print("Forecasted sales for the next 10 days:")
print(forecast)

stock = 200  
predicted_total_sales = forecast.sum()
if predicted_total_sales > stock:
    print("ALERT: Predicted sales exceed current stock level!")
else:
    print("Stock level is sufficient for the next 10 days.")
