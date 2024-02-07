import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
doc = pd.read_csv('times.csv')

SortTypes = doc["Sort"]
Times = doc["Time"]
Complexities = doc["Complexity"]

QuickSort = doc[doc["Sort"] == "Quicksort"]
MergeSort = doc[doc["Sort"] == "MergeSort"]
RadixSort = doc[doc["Sort"] == "RadixSort"]
GnomeSort = doc[doc["Sort"] == "GnomeSort"]



def plot():
    import numpy as np
    import matplotlib.pyplot as plt

    fig, axs = plt.subplots(2, 2, figsize=(10, 8))

    axs[0, 0].scatter(QuickSort["Complexity"], QuickSort["Time"], color="blue")
    axs[0, 0].set_title("Quicksort")
    z_quick = np.polyfit(QuickSort["Complexity"], QuickSort["Time"], 1)
    p_quick = np.poly1d(z_quick)
    axs[0,0].plot(QuickSort["Complexity"], p_quick(QuickSort["Complexity"]), "r--")

    axs[0, 1].scatter(MergeSort["Complexity"], MergeSort["Time"], color="green")
    axs[0, 1].set_title("Mergesort")
    z_merge = np.polyfit(MergeSort["Complexity"], MergeSort["Time"], 1)
    p_merge = np.poly1d(z_merge)
    axs[0,1].plot(MergeSort["Complexity"], p_merge(MergeSort["Complexity"]), "r--")

    axs[1, 0].scatter(RadixSort["Complexity"], RadixSort["Time"], color="brown")
    axs[1, 0].set_title("Radixsort")
    z_radix = np.polyfit(RadixSort["Complexity"], RadixSort["Time"], 1)
    p_radix = np.poly1d(z_radix)
    axs[1,0].plot(RadixSort["Complexity"], p_radix(RadixSort["Complexity"]), "r--")


    axs[1, 1].scatter(GnomeSort["Complexity"], GnomeSort["Time"], color="yellow")
    axs[1, 1].set_title("Gnomesort")
    z_gnome = np.polyfit(GnomeSort["Complexity"], GnomeSort["Time"], 2)
    p_gnome = np.poly1d(z_gnome)
    axs[1,1].plot(GnomeSort["Complexity"], p_gnome(GnomeSort["Complexity"]), "r--")


    for ax in axs.flat:
        ax.set(xlabel="Input Size", ylabel="Time (ms)")

    plt.suptitle("Time Complexity Analysis of Sorting Algorithms")
    plt.tight_layout()
    plt.show()

plot()


