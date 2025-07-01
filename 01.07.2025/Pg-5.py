import json
from datetime import datetime

def log_weather(temp, humidity):
    data = {
        'timestamp': datetime.now().isoformat(),
        'temperature': temp,
        'humidity': humidity
    }
    with open('weather_log.json', 'a') as f:
        f.write(json.dumps(data) + "\n")

log_weather(28, 75)
log_weather(30, 70)
