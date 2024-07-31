
import matplotlib.pyplot as plt
import numpy as np
import time

def random():
    seed = int(time.time())
    rng = np.random.default_rng(seed)
    return rng.random()

random()